import {
  inquiryList,
  inquiryRegist,
  inquiryDetail,
  inquiryDelete,
  inquiryModify
} from '@/api/inquiry.js'

const inquiryStore = {
  namespaced: true,
  state: { inquiries: [], inquiry: {} },
  getters: {},
  mutations: {
    setInquiries(state, payload) {
      state.inquiries = payload
    },
    setInquiry(state, payload) {
      state.inquiry = payload
    }
  },
  actions: {
    inquiryList: ({ commit }, page) => {
      return inquiryList(
        page,
        (response) => {
          commit('setInquiries', response.data.inquiryList.content)
        },
        (error) => {
          console.log(error)
        }
      )
    },
    inquiryDetail: ({ commit }, inquiryNo) => {
      return inquiryDetail(
        inquiryNo,
        (response) => {
          commit('setInquiry', response.data.inquiry)
        },
        (error) => {
          console.log(error)
        }
      )
    },
    inquiryRegist: (context, inquiry) => {
      return inquiryRegist(
        inquiry,
        () => {},
        (error) => {
          console.log(error)
        }
      )
    },
    inquiryDelete: (context, inquiryNo) => {
      return inquiryDelete(
        inquiryNo,
        () => {},
        (error) => {
          console.log(error)
        }
      )
    },
    inquiryModify: (context, inquiry) => {
      console.log(inquiry)
      return inquiryModify(
        inquiry.no,
        inquiry,
        () => {},
        (error) => {
          console.log(error)
        }
      )
    }
  }
}

export default inquiryStore
