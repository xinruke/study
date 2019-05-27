<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <br>
    <el-input v-model="userName" placeholder="用户名" id="userName" size="small" style="width:200px;"
              clearable=""></el-input>
    <br>
    <el-input v-model="userPwd" placeholder="密 码" id="userPwd" size="small" style="width:200px;"
              clearable=""></el-input>
    <br>

    <el-button v-on:click="doRegister">注册</el-button>
    <el-button type="primary" v-on:click="doLogin">登录</el-button>
    <el-button type="text">忘记密码</el-button>

    <div style="position: absolute; top: 0px;left:45%;width:200px;" align="center">
      <el-alert title="提示" type="success" show-icon="" description="描述信息" closable=""></el-alert>
    </div>
  </div>
</template>

<script>
  import LeanCloud from 'leancloud-storage';

  export default {
    name: 'HelloWorld',
    data() {
      return {
        msg: 'Welcome to Your Vue.js App',
        userName: '',
        userPwd: ''
      }
    },
    mounted: function () {
    },
    methods: {
      doLogin: function () {
        var testObject = new LeanCloud.Query('TestObject');
        testObject.equalTo("name", this.userName);
        var userPwd = this.userPwd;

        testObject.find().then(function (object) {
          if (object.length > 0) {
            alert('登录失败，用户名或密码不正确');
          } else {
            object.forEach(function (list) {
              let pwd = list.get("password");
              if (pwd == userPwd) {
                alert('登录成功!');
              } else {
                alert('登录失败，用户名或密码不正确');
              }
            });
          }
        }, function (error) {
          alert('登录失败!' + object);
        });

        /*this.axios.get('http://localhost:8762/user/login/loginByParam', {
          params: {
            name: this.userName,
            password: this.userPwd
          }
        }).then((response) => {
          alert(response.data);
        }).catch((error) => {
          alert("请求异常" + error);
        });*/
      },
      doRegister: function () {
        var userName = this.userName;
        var userPwd = this.userPwd;

        var testObjectQuery = new LeanCloud.Query('TestObject');
        testObjectQuery.equalTo("name", userName);

        testObjectQuery.find().then(function (object) {
          if (object.length > 0) {
            alert('注册失败，用户已存在');
          } else {
            var TestObject = LeanCloud.Object.extend('TestObject');
            var testObject = new TestObject();
            testObject.set("name", userName);
            testObject.set("password", userPwd);

            testObject.save().then(function (object) {
              alert('注册成功!');
            }, function (error) {
              alert('注册失败!');
            });
          }
        }, function (error) {
          alert('注册失败!' + object);
        });

      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
