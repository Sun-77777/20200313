import Vue from '../node_modules/vue/dist/vue'
import VueRouter from '../node_modules/vue-router/dist/vue-router'
import registerForm from './register'
import loginForm from './login'
import './css/index.css'

Vue.use(VueRouter);

let router = new VueRouter({
    routes:[
        {
            path:"/login",
            component:loginForm
        },
        {
            path:"/register",
            component:registerForm
        }
    ]
});

let vm = new Vue({
    el:"#app",
    components:{
        loginForm,
        registerForm
    },
    router
});