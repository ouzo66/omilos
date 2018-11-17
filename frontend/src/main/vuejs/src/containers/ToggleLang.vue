<template>
    <b-dropdown id="ddown-sm" size="sm" :text="$t(getLangLabel(currentLanguage))" variant="link" class="m-2">
        <b-dropdown-item v-for="lang in supportedLanguages" class="md-11" @click="changeLanguage(lang)"><i class="fa fa-check" aria-hidden="true" v-if="isCurrentLanguage(lang)"></i> {{$t(getLangLabel(lang))}}</b-dropdown-item>
    </b-dropdown>
</template>

<script>
import { HeaderDropdown as AppHeaderDropdown } from '@coreui/vue'
import { Trans } from '@/shared/trans'

export default {
  name: 'ToggleLang',
  components: {
    AppHeaderDropdown
  },
  computed: {
    supportedLanguages () {
      return Trans.supportedLanguages
    },
    currentLanguage () {
      return Trans.currentLanguage
    }
  },
  methods: {
    changeLanguage (value) {
      const lang = value
      const to = this.$router.resolve({ params: { lang } })
      return Trans.changeLanguage(lang).then(() => {
        this.$router.push(to.location)
      })
    },
    isCurrentLanguage (lang) {
      return lang === this.currentLanguage
    },
    getLangLabel (lang) {
      return 'language.'+lang
    }
  }
}
</script>