# OrLeave 올리브

> 비대면 소개팅 서비스

## 로고

![Logo](README.assets/Logo.png)

## 팀원소개

![팀원소개](README.assets/팀원소개.png)

## 기술 스택

### 관리도구

<img src="https://img.shields.io/badge/GitLab-FCA121?style=for-the-badge&logo=GitLab&logoColor=white"> <img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=JiraSoftware&logoColor=white"> <img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white"> <img src="https://img.shields.io/badge/Mattermost-0058CC?style=for-the-badge&logo=Mattermost&logoColor=white">

### Back-End

<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=ava&logoColor=white"> <img src="https://img.shields.io/badge/spring boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">

### Front-End

<img src="https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=HTML5&logoColor=white"> <img src="https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=CSS3&logoColor=white"> <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=black"> <img src="https://img.shields.io/badge/npm-CB3837?style=for-the-badge&logo=npm&logoColor=white"> <img src="https://img.shields.io/badge/vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white"> <img src="https://img.shields.io/badge/nodejs-339933?style=for-the-badge&logo=node.js&logoColor=white"> <img src="https://img.shields.io/badge/quasar-1976D2?style=for-the-badge&logo=quasar&logoColor=white">

### 서버

<img src="https://img.shields.io/badge/ubuntu-E95420?style=for-the-badge&logo=Ubuntu&logoColor=white"> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white"> <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=NGINX&logoColor=white"> <img src="https://img.shields.io/badge/Openvidu-ffcd00?style=for-the-badge&logo=&logoColor=black"> <img src="https://img.shields.io/badge/kurento-ffcd00?style=for-the-badge&logo=&logoColor=black">



1. 작업관리 : Jira
2. 형상관리 : Gitlab
3. 메신저 : Mattermost
4. 개발환경
   - OS : Window 10
   - IDE
     - Visual Studio Code 1.69.2
     - Eclipse 2020-06
     - MySQL Workbench 8.0 CE
   - 데이터베이스 : Mysql 5.7
   - 프론트엔드 :
     - Vue : 3.2.13
     - Node.js : 14.17.6
     - Vuex : 4.0.0
     - Quasar : 2.0.0
   - 백엔드 :
     - Java : OpenJDK 1.8.0_192
     - Gradle : 7.5
     - Spring : 5.3.6
     - SpringBoot : 2.4.5
     - querydsl : 4.4.0
     - lombok : 1.18.24
5. 서버 : AWS EC2
   - Tool : MobaXterm
   - OS : ubuntu 20.04
   - Nginx : 1.18.0
   - Docker : 20.10.17
   - Openvidu : 2.22.0
   - Kurento-media-server : 6.16.0



## [와이어 프레임](https://www.figma.com/file/j5OzZBpbjejXIw18JQomRB/OrLeave?node-id=0%3A1)

![wire_frame](README.assets/wire_frame.png)

## Style Guide

![style_guide](README.assets/style_guide.png)

## ERD 다이어그램

![ERD](README.assets/ERD.png)

## [기능명세서](https://docs.google.com/spreadsheets/d/1iBTKCzx7lzYH7YWYYFgMEQgo3bqs2lh0LCCXyjAavOA/edit#gid=0)

![기능명세서.png](README.assets/기능명세서.png)



## [API명세서](https://docs.google.com/spreadsheets/d/1ihB1o0xKKdK35dzXh3goaO711LWoWAnFTGnUXBgJTcc/edit#gid=0)
![API명세서](README.assets/API명세서.png)



## 기획배경

최근 국내 데이팅 앱 시장 규모는 점점 커지고 있다. 약 10개 가량의 소개팅 서비스를 조사한 결과,<br /> 
대부분의 서비스에서 외모, 나이, 직업 등 외형적인 기준을 첫인상으로 간주하게 되는 환경을 가지고 있었습니다. <br />
하지만 현실에서는 외형적인 기준으로 판단한 첫인상은 부정확한 경우가 많습니다. <br />
외모뿐만 아니라 성격, 대화, 말투 등 다른 매력 요소 역시 상대방을 파악하는데 중요하기 때문입니다.<br />
따라서 모두가 쉽게 이용할 수 있고, 외모로 상대방을 먼저 인지하지 않고 **대화를 통해 상대방을 천천히 알아갈 수 있는 서비스**를 기획했습니다.

## 세부기능

### 매칭옵션
![매칭설정](README.assets/매칭설정.gif)

### 미팅로비
![매칭대기화면](README.assets/매칭대기화면.gif)

### 미팅룸
![단계별소개팅](README.assets/단계별소개팅.gif)

### 신고기능
![신고](README.assets/신고.gif)

### 차단리스트
![최근통화목록_차단관리](README.assets/최근통화목록_차단관리.gif)

## 아키텍처
![아키텍처](README.assets/아키텍처.png)

## git 컨벤션

| 태그             | 내용                                                    |
| ---------------- | ------------------------------------------------------- |
| Feat             | 새로운 기능을 추가할 경우                               |
| Fix              | 버그를 고친 경우                                        |
| Design           | CSS 등 사용자 UI 디자인 변경                            |
| !BREAKING CHANGE | 커다란 API 변경의 경우                                  |
| !HOTFIX          | 급하게 치명적인 버그를 고쳐야 하는 경우                 |
| Style            | 코드 포맷 변경, 세미 콜론 누락, 코드 수정이 없는 경우   |
| Refactor         | 프로덕션 코드 리팩토링                                  |
| Comment          | 필요한 주석 추가 및 변경                                |
| Docs             | 문서를 수정한 경우                                      |
| Rename           | 파일 혹은 폴더명을 수정하거나 옮기는 작업만 수행한 경우 |
| Remove           | 파일을 삭제하는 작업만 수행한 경우                      |
| Modify           | 파일 내용 수정                                          |

#### Git Message Rule

> Xxx: xxx xxx

- Tag의 첫 글자는 대문자로, Body는 한글로 작성
  - ex) Feat: 오픈비두 백엔드 연결

#### Git Flow

1. 기능별 FE/BE 브랜치로 나눠 구현
2. FE/BE 구분하여 구현한 내용을 Develop 브랜치로 머지 후 테스트
3. Develop 브랜치에서 구동 확인 후 Master 브랜치로 머지

## Jira

#### Jira Convention

| Issue Type | 설명                                                                                  | 예시                                |
| ---------- | ------------------------------------------------------------------------------------- | ----------------------------------- |
| Epic       | 최상위 수준의 기능/작업 단위(프로젝트 전반 또는 여러 Sprint에 걸쳐 진행할 정도의 범위 | 회원 관리, 로그인 관리              |
| Story      | Epic에 대한 하위 Level 수준의 기능/작업 단위                                          | 회원 가입, 회원 정보 수정, 로그인.. |
| Task       | 개발에 직접 해당되지는 않으나 Sprint안에 포함하는 일                                  | ERD작성, 테스트케이스 작성          |
| Sub-task   | 위 Issue들과 관련하여 세부 단위 작업 등이 필요할 때                                   |                                     |

#### Sprint

- 예외가 없다면 Sub PJT 1, 2, 3을 Sprint로 생성(6주)
- 1인 하루 8포인트씩 5일 = 40 point

#### BurnDown Chart

![Burn_down_chart](README.assets/Burn_down_chart.png)

## 배포 방법

<details>
<summary>도커 설치</summary>
<div markdown="1">

```
#설치 고려사항 확인 64bit, 리눅스 커널정보(3.10 이상)
uname -a

#설치 가능한 리스트 업데이트
sudo apt-get update

sudo apt-get install -y \
apt-transport-https \
curl \
ca-certificates \
software-properties-common

#docker의 공식 GPG(GNU Privacy Guard) key를 추가
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

#추가된 키 + 도커에서 배포한 키확인
sudo apt-key fingerprint
sudo apt-key fingerprint 0EBFCD88

#debian 계열의 docker repository 추가 후 apt update 수행
sudo add-apt-repository \
"deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

sudo apt-get update
#docker CE 버전 설치
sudo apt-get install docker-ce

#sudo 없이 도커 사용
sudo usermod -aG docker zeff
sudo systemctl enable docker
sudo systemctl restart docker
sudo reboot

#도커 컴포즈 설치
sudo curl -L \
"https://github.com/docker/compose/releases/download/1.27.4/dockercompose -$(uname -s)-$(uname -m)"\
-o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
```

</div>
</details>

<details>
<summary>NGINX + SSL 설정</summary>
<div markdown="1">

```
#nginx 설치
sudo apt-get update
sudo apt-get install nginx
sudo systemctl start nginx
sudo systemctl status nginx

#active면 동작중
● nginx.service - A high performance web server and a reverse proxy server
     Loaded: loaded (/lib/systemd/system/nginx.service; enabled; vendor preset: enabled)
     Active: active (running) since Fri 2022-08-05 23:07:26 KST; 1 weeks 4 days ago
		 ...
		 ...

#SSL 설정
#https://certbot.eff.org/instructions?ws=apache&os=ubuntufocal 참고

#snap 패키지 관리 툴 설지
apt-get install snapd

#snap 최신화
sudo snap install core
sudo snap refresh core

#certbot 설치
sudo snap install --classic certbot

#ln 명령어로 cli에서 certbot 커맨드 사용가능하게 설정
sudo ln -s /snap/bin/certbot /usr/bin/certbot

#ssl 인증서 발급
sudo certbot certonly --nginx -d i7a502.p.ssafy.io

#프록시 설정
cd /etc/nginx/sites-available
sudo vi orleave

server {
        location /{ # /로 시작하는 url은 http://localhost:3000으로 중계(프론트엔드)
                proxy_pass http://localhost:3000;
                proxy_http_version 1.1;
                proxy_set_header Upgrade $http_upgrade;
                proxy_set_header Connection "Upgrade";
                proxy_set_header Host $host;
        }

        location /api { # /api로 시작하는 url은 http://localhost:8181/api으로 중계(백엔드)
                proxy_pass http://localhost:8181/api;
        }

        listen 443 ssl;
        ssl_certificate /etc/letsencrypt/live/i7a502.p.ssafy.io/fullchain.pem;
        ssl_certificate_key /etc/letsencrypt/live/i7a502.p.ssafy.io/privkey.pem;
				# include /etc/letsencrypt/options-ssl-nginx.conf;
        # ssl_dhparam /etc/letsencrypt/ssl-dhparams.pem;
}

server {
        if ($host = i7a502.p.ssafy.io) {
                return 301 https://$host$request_uri;
        }

                listen 80;
                server_name i7a502.p.ssafy.io;
        return 404;
}
```

</div>
</details>

<details>
<summary>MYSQL 실행 + 설정</summary>
<div markdown="1">

```
#mysql 실행
docker run –name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=cityview1202502 \
-d mysql:5.7 –character-set-server=utf8 –collation-server=utf8_unicode_ci

#mysql 컨테이너 접속
docker exec -it mysql /bin/sh
sh-4.2# mysql -u root -p
Enter password: cityview1202502

#루트 계정 이름 변경
mysql> use mysql
mysql> update user set user='ssafy502' where user='root';
mysql> flush privileges;
mysql> exit
```

</div>
</details>

<details>
<summary>OPENVIDU 설치 + 설정</summary>
<div markdown="1">

```
#권장 설치 경로
cd /opt
#오픈비두 설치
sudo curl https://s3-eu-west-1.amazonaws.com/aws.openvidu.io/install_openvidu_latest.sh | sudo bash
cd openvidu
sudo vi .env

...
# For example: 198.51.100.1, or openvidu.example.com
DOMAIN_OR_PUBLIC_IP=(도메인 또는 아이피 주소값)

# OpenVidu SECRET used for apps to connect to OpenVidu server and users to access to OpenVidu Dashboard
OPENVIDU_SECRET=(원하는 비밀번호)

# Certificate type:
# - selfsigned:  Self signed certificate. Not recommended for production use.
#                Users will see an ERROR when connected to web page.
# - owncert:     Valid certificate purchased in a Internet services company.
#                Please put the certificates files inside folder ./owncert
#                with names certificate.key and certificate.cert
# - letsencrypt: Generate a new certificate using letsencrypt. Please set the
#                required contact email for Let's Encrypt in LETSENCRYPT_EMAIL
#                variable.
CERTIFICATE_TYPE=letsencrypt

# If CERTIFICATE_TYPE=letsencrypt, you need to configure a valid email for notifications
LETSENCRYPT_EMAIL=(원하는 이메일)

# Proxy configuration
# If you want to change the ports on which openvidu listens, uncomment the following lines

# Allows any request to http://DOMAIN_OR_PUBLIC_IP:HTTP_PORT/ to be automatically
# redirected to https://DOMAIN_OR_PUBLIC_IP:HTTPS_PORT/.
# WARNING: the default port 80 cannot be changed during the first boot
# if you have chosen to deploy with the option CERTIFICATE_TYPE=letsencrypt
HTTP_PORT=8442

# Changes the port of all services exposed by OpenVidu.
# SDKs, REST clients and browsers will have to connect to this port
HTTPS_PORT=8443
...
...


```

</div>
</details>

<details>
<summary>배포 시작</summary>
<div markdown="1">

```
sudo apt-get install git
git clone (해당 레포지토리 url)
(세부 ignore 파일이나 빌드 방법은 exec 디렉토리의 포팅매뉴얼 참고)
(각각의 Dockerfile이 위치한 디렉토리에서 아래의 커맨드 실행)

#백엔드
docker build -t orleave_backend:0.1 .
docker stop orleave
docker run --rm --name orleave -d -p 8181:8181 orleave_backend:0.1

#프론트엔드
docker build -t nginx-vue:0.1 .
docker stop nginx_vue
docker run --rm --name nginx_vue -d -p 3000:80 nginx-vue:0.1

#openvidu 배포
cd /opt/openvidu
./openvidu start

#실행 확인
docker ps
CONTAINER ID   IMAGE                                 COMMAND                  CREATED        STATUS                 PORTS                                                                                                      NAMES
e130acdb276a   orleave_backend:0.1                   "java -jar /app.jar"     19 hours ago   Up 19 hours            0.0.0.0:8181->8181/tcp, :::8181->8181/tcp                                                                  orleave
68a445d32fd2   nginx-vue:0.1                         "/docker-entrypoint.…"   19 hours ago   Up 19 hours            0.0.0.0:3000->80/tcp, :::3000->80/tcp                                                                      nginx_vue
74ab30a2daa4   mysql:5.7                             "docker-entrypoint.s…"   13 days ago    Up 13 days             0.0.0.0:3306->3306/tcp, :::3306->3306/tcp, 33060/tcp                                                       mysql
536b9d2aa576   openvidu/openvidu-call:2.22.0         "docker-entrypoint.s…"   2 weeks ago    Up 2 weeks                                                                                                                        openvidu_app_1
9c545ec31f46   openvidu/openvidu-proxy:2.22.0        "/docker-entrypoint.…"   2 weeks ago    Up 2 weeks                                                                                                                        openvidu_nginx_1
e8b8f6b32376   kurento/kurento-media-server:6.16.0   "/entrypoint.sh"         2 weeks ago    Up 2 weeks (healthy)                                                                                                              openvidu_kms_1
2d628a6220df   openvidu/openvidu-coturn:2.22.0       "docker-entrypoint.s…"   2 weeks ago    Up 2 weeks             0.0.0.0:3478->3478/tcp, 0.0.0.0:3478->3478/udp, :::3478->3478/tcp, :::3478->3478/udp, 5349/tcp, 5349/udp   openvidu_coturn_1
9c39965ecd39   openvidu/openvidu-server:2.22.0       "/usr/local/bin/entr…"   2 weeks ago    Up 2 weeks                                                                                                                        openvidu_openvidu-server_1

```

</div>
</detail>



## 소감

### Frontend

- [김시언](https://github.com/TIONBARY)

  FE를 담당해 많이 배웠고, SpringBoot와 배포에서도 많이 배울 수 있었다. 
  개발 중 막힐 때, 좌절하지 않고 깊게 파고들어 문제를 해결하는 방법을 꺠달았습니다.

- [정승욱](https://github.com/tmddnrdl333)
  vue3를 더 잘 다룰 수 있게 된 좋은 계기였다. 매칭 로직이 어려웠지만, 결국 날 죽이진 못했다.
  "날 죽이지 못하는 고통은 나를 더 강하게 해줄 뿐이다." - 프리드리히 니체

- [정지은](https://github.com/zzz0105)
  하루의 시작과 끝에 진행하는 스크럼 미팅 및 일일결산을 통한 소통과 팀워크 덕분에 프로젝트를 잘 마무리할 수 있었다. 기획부터 배포까지 모두 우리 손으로 만들고, 에러를 해결하다 보니 모든 기능이 주요 기능처럼 느껴진다. 

### Backend

- [박상수](https://github.com/qkftkftnf)
  기획부터 제작까지 직접 해본 경험은 처음이여서 매우 신선하고 유익한 시간이였다. 이 기회로 개발자로서 한걸음 나아간 기분이다.

- [윤지환](https://github.com/yjh2569)
  팀원과의 페이스를 맞춰가며 개발을 하지 않고 독단적으로 작업을 하는 경우가 많았는데 이러한 경우 코드가 충돌되는 경우가 많았습니다. 이를 통해 팀 프로젝트를 할 때 스크럼 회의와 일일결산, 프로젝트 관리 툴 등으로 팀원과의 소통을 통해 프로젝트 진행 상황을 공유하는 것이 매우 중요하다는 것을 깨달았습니다.

- [허상](https://github.com/heosang/)
  다섯명이 모이면 한명은 쓰레기라는 말이있다

  항상 내가 그 사람이라고 다짐하며 더 나은 사람이 되기 위해 노력했다. 아니나다를까 치명적인 전염병에 걸려 중요한 시간에 팀원들에게 부담을 줬다. 그럼에도 주어진 상황에서 서로의 작업을 도와 성공적으로 프로젝트를 완수할 수 있었다 역시 팀워크가 가장 중요하다는것을 다시금 느낄 수 있었다
