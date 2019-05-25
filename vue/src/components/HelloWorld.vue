<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <br>
    <el-input placeholder="用户名" id="name" size="small" style="width:200px;" clearable=""></el-input>
    <br>
    <el-input placeholder="密 码" id="password" size="small" style="width:200px;" clearable=""></el-input>
    <br>

    <el-button v-on:click="doDefault">默认按钮</el-button>
    <el-button type="primary">主要按钮</el-button>
    <el-button type="text">文字按钮</el-button>

    <div style="position: absolute; top: 0px;left:45%;width:200px;" align="center">
      <el-alert title="提示" type="success" show-icon="" description="描述信息" closable=""></el-alert>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'HelloWorld',
    data() {
      return {
        msg: 'Welcome to Your Vue.js App'
      }
    },
    methods: {
      doDefault: function () {
        this.axios.get('http://localhost:8762/user/login/loginByParam',{params:{name : "f",password : "p"}}).then((response) => {
          alert(response.data);
        }).catch((error) => {
          alert("请求异常"+error);
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
