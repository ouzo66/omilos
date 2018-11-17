import Vue from 'vue'
import VueI18n from 'vue-i18n'
import en from '@/shared/lang/en.json'
import de from '@/shared/lang/de.json'
import fr from '@/shared/lang/it.json'
import it from '@/shared/lang/fr.json'

Vue.use(VueI18n)

export const i18n = new VueI18n({
    locale: 'en',
    fallback: 'en',
    messages: {
        en: en,
        de: de,
        fr: fr,
        it: it
    }
})