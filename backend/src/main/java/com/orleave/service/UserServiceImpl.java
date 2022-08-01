package com.orleave.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.orleave.dto.request.SignupRequestDto;
import com.orleave.entity.LoginTrial;
import com.orleave.entity.MeetingSetting;
import com.orleave.entity.User;
import com.orleave.entity.UserInterest;
import com.orleave.entity.UserPersonality;
import com.orleave.repository.LoginTrialRepository;
import com.orleave.repository.MeetingSettingRepository;
import com.orleave.repository.UserInterestRepository;
import com.orleave.repository.UserPersonalityRepository;
import com.orleave.repository.UserRepository;
import com.orleave.repository.UserRepositorySupport;


/**
 *	유저 관련 비즈니스 로직 처리를 위한 서비스 구현 정의.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LoginTrialRepository loginTrialRepository;
	
	@Autowired
	MeetingSettingRepository meetingSettingRepository;
	
	@Autowired
	UserInterestRepository userInterestRepository;
	
	@Autowired
	UserPersonalityRepository userPersonalityRepository;
	
	@Autowired
	UserRepositorySupport userRepositorySupport;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Override
	@Transactional
	public User createUser(SignupRequestDto signupInfo) {
		
		User user = User.builder()
				.email(signupInfo.getEmail())
				.password(passwordEncoder.encode(signupInfo.getPassword()))
				.userType(signupInfo.getUserType())
				.gender(signupInfo.getGender())
				.birthDay(signupInfo.getBirthDay())
				.nickname(signupInfo.getNickname())
				.mbti(signupInfo.getMbti())
				.religion(signupInfo.getReligion())
				.smoke(signupInfo.getSmoke())
				.drink(signupInfo.getDrink())
				.imageNo(signupInfo.getImageNo())
				.build();
		userRepository.save(user);
		LoginTrial loginTrial = LoginTrial.builder()
				.user(user)
				.time(LocalDateTime.of(1970, 1, 1, 0, 0))
				.build();
		loginTrialRepository.save(loginTrial);
		MeetingSetting meetingSetting = MeetingSetting.builder()
				.user(user)
				.religion(0)
				.smoke(0)
				.drinkMin(0)
				.drinkMax(2)
				.distance(4)
				.ageMin(20)
				.ageMax(50)
				.build();
		meetingSettingRepository.save(meetingSetting);
		user.setInterests(new ArrayList<UserInterest>());
		for (int interest : signupInfo.getInterests()) {
			UserInterest userInterest = UserInterest.builder()
					.user(user)
					.interest(interest)
					.build();
			user.addInterest(userInterest);
			userInterestRepository.save(userInterest);
		}
		user.setPersonalities(new ArrayList<UserPersonality>());
		for (int personality : signupInfo.getPersonalities()) {
			UserPersonality userPersonality = UserPersonality.builder()
					.user(user)
					.personality(personality)
					.build();
			user.addPersonality(userPersonality);
			userPersonalityRepository.save(userPersonality);
		}
		return user;
	}
	
	@Override
	public User getUserByNo(int no) {
		User user = userRepositorySupport.findUserByNo(no).get();
		return user;
	}
	
	@Override
	public User getUserByEmail(String email) {
		// 디비에 유저 정보 조회 (email을 통한 조회).
		User user = userRepositorySupport.findUserByEmail(email).get();
		return user;
	}
	
	@Override
	public User getUserByNickname(String nickname) {
		// 디비에 유저 정보 조회 (nickname을 통한 조회).
		User user = userRepositorySupport.findUserByNickname(nickname).get();
		return user;
	}
}
