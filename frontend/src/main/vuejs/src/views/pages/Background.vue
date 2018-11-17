<template>
    <div class="app">


        <div class="bg">
            <div class="opacity">
                        <b-navbar toggleable="md" type="dark" fixed sticky="true">
            <b-navbar-brand to="/" tag="h1"><b><i class="fa fa-globe" aria-hidden="true"></i>milos</b></b-navbar-brand>
            <b-navbar-nav class="ml-auto" >
                    <b-nav-item v-for="lang in supportedLanguages" :key="lang" @click="changeLanguage(lang)" ><span  :class="underline(lang)"> {{$t(getLangLabel(lang))}}</span> </b-nav-item>
                </b-navbar-nav>
        </b-navbar>
            <router-view/>
            </div>

        </div>
        <footer class="app-footer" fixed>
            <div >Footer Todo</div>
        </footer>
    </div>
    
</template>

<script>
import { Trans } from "@/shared/trans";

export default {
  data() {
    return {
      bgImage: "/public/img/bg/bg001.jpg"
    };
  },
  computed: {
    name() {
      return this.$route.name;
    },
    supportedLanguages () {
      return Trans.supportedLanguages
    },
    currentLanguage () {
      return this.$i18n.locale
    }
  },
  methods: {
    changeLanguage (value) {
        return this.$i18n.locale = value
    },
    isCurrentLanguage (lang) {
      return lang === this.currentLanguage
    },
    getLangLabel (lang) {
      return 'language.'+lang
    },
    underline(lang) {
        if (lang === this.currentLanguage) {
            return "underline"
        }
        return ""
    }
  }
};
</script>

<style scoped>
.bg {
  background: url("/img/bg/bg002.jpg") no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  background-size: cover;
  -o-background-size: cover;
  height: 100%;
  display: block;
}
.opacity {
  background-color: rgba(40, 40, 80, 0.8);
  height: 100%;
  display: block;
}

.underline {
    padding-bottom: 5px;
    border-bottom: 2px solid white;
    font-weight: bold;
}
.app-footer {
    position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
}
</style>
