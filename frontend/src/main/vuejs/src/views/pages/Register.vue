<template>
  <div class="app flex-row align-items-center">
    <div class="container">
      <b-row class="justify-content-center">
        <b-col md="6" sm="8">
          <b-card no-body class="mx-4">
            <b-card-body class="p-4">
              <b-form >
                <h1>{{$t('register.title')}}</h1>
                <p class="text-muted">{{$t('register.message')}}</p>
                <b-input-group class="mb-3">
                  <b-input-group-prepend>
                    <b-input-group-text><i class="icon-user"></i></b-input-group-text>
                  </b-input-group-prepend>
                  <b-form-input id="firstname" v-model="register.firstname" type="text" class="form-control" :placeholder="$t('user.firstname')" autocomplete="firstname" />
                </b-input-group>
                <b-input-group class="mb-3">
                  <b-input-group-prepend>
                    <b-input-group-text><i class="icon-user"></i></b-input-group-text>
                  </b-input-group-prepend>
                  <b-form-input id="lastname" v-model="register.lastname" type="text" class="form-control" :placeholder="$t('user.lastname')" autocomplete="lastname" />
                </b-input-group>

                <b-input-group class="mb-3">
                  <b-input-group-prepend>
                    <b-input-group-text>@</b-input-group-text>
                  </b-input-group-prepend>
                  <b-form-input type="text" id="email" v-model="register.email" class="form-control" :placeholder="$t('user.email')" autocomplete="email" />
                </b-input-group>

                <b-input-group class="mb-3">
                  <b-input-group-prepend>
                    <b-input-group-text><i class="icon-lock"></i></b-input-group-text>
                  </b-input-group-prepend>
                  <b-form-input type="password" id="password" v-model="register.password" class="form-control" :placeholder="$t('user.password')" autocomplete="new-password" />
                </b-input-group>

                <b-input-group class="mb-4">
                  <b-input-group-prepend>
                    <b-input-group-text><i class="icon-lock"></i></b-input-group-text>
                  </b-input-group-prepend>
                  <b-form-input type="password" id="passwordrepeat" v-model="register.passwordrepeat" class="form-control" :placeholder="$t('user.passwordrepeat')" autocomplete="new-password" />
                </b-input-group>

                <b-button variant="success" block>{{$t('register.button')}}</b-button>
                <div>{{register}}</div>
              </b-form>
               
            </b-card-body>
           
            <b-card-footer class="p-4">
              <b-row>
                <b-col cols="6">
                  <b-button block class="btn btn-facebook"><span>facebook</span></b-button>
                </b-col>
                <b-col cols="6">
                  <b-button block class="btn btn-twitter" type="button"><span>twitter</span></b-button>
                </b-col>
              </b-row>
            </b-card-footer>
          </b-card>
        </b-col>
      </b-row>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Register',
  data: function () {
    return { 
        register : { }
      }
  }
}
</script>
