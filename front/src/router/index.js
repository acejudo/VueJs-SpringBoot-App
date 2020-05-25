import Vue from 'vue'
import Router from 'vue-router'
import ApiTest from '@/components/ApiTest'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'ApiTest',
      component: ApiTest
    }
  ]
})
