import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
// 1
import axios from 'axios'
import Buefy from 'buefy'
import 'buefy/dist/buefy.css'

Vue.use(Buefy)


Vue.config.productionTip = false
// 2
Vue.prototype.$http = axios



new Vue({
  axios,
  router,
  store,
  render: h => h(App)
}).$mount('#app')
