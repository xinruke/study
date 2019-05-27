// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
Vue.use(ElementUI, {size : 'small'})

import axios from 'axios'
Vue.prototype.axios = axios

// 存储服务
var LeanCloud = require('leancloud-storage');
var { Query, User } = LeanCloud;
// 即时通讯服务
var { Realtime, TextMessage } = require('leancloud-realtime');
//存储服务的 LiveQuery 功能
var LeanCloud = require('leancloud-storage/live-query');


Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
