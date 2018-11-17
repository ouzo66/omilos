<template>
    <div class="animated fadeIn">
            <h1>Registrierung</H1>
            <b-tabs>
            <b-tab title="Verein" active>
            <b-card no-body class="mx-4">
                        <b-card-body class="p-4">
                          <b-form @submit="onSubmit" >

                            <p class="text-muted">Registriere dein Verein</p>
                            <b-input-group class="mb-3">
                              <b-input-group-prepend>
                                <b-input-group-text><i class="icon-user"></i></b-input-group-text>
                              </b-input-group-prepend>
                              <b-form-input  type="text" class="form-control" placeholder="Vereinsname" v-model="clubname" :state="Boolean(clubname)" autocomplete="clubname" />
                            </b-input-group>

                          <b-input-group class="mb-3">
                              <b-input-group-prepend>
                                  <b-input-group-text><i class="icon-picture"></i></b-input-group-text>
                              </b-input-group-prepend>
                               <b-form-file @change="onFileChange" accept="image/jpeg, image/png, image/gif" id="logoupload" v-model="file" :state="Boolean(file)" placeholder="Choose a logo..."></b-form-file>

                          </b-input-group>
                          <div class="mb-3">
                          <b-img v-if="url" thumbnail :src="url" />
                          </div>

                            <b-input-group class="mb-3">
                              <b-input-group-prepend>
                                <b-input-group-text><i class="icon-directions"></i></b-input-group-text>
                              </b-input-group-prepend>
                              <b-form-input type="text" class="form-control" placeholder="Strasse" autocomplete="street" />
                            </b-input-group>


                            <b-input-group class="mb-3">
                              <b-input-group-prepend>
                                <b-input-group-text><i class="icon-envelope-open"></i></b-input-group-text>
                              </b-input-group-prepend>
                              <b-form-input type="number" class="form-control col-md-3" placeholder="PLZ" autocomplete="plz" />
                              <b-form-input type="text" class="form-control" placeholder="Stadt" autocomplete="town" />
                            </b-input-group>

                            <b-input-group class="mb-3">
                              <b-input-group-prepend>
                                <b-input-group-text><i class="icon-flag"></i></b-input-group-text>
                              </b-input-group-prepend>
                              <b-form-input type="text" class="form-control" placeholder="Land" autocomplete="country" />
                            </b-input-group>

                            <b-input-group class="mb-3">
                              <b-input-group-prepend>
                                <b-input-group-text>@</b-input-group-text>
                              </b-input-group-prepend>
                              <b-form-input type="email" class="form-control" placeholder="Email" autocomplete="email" />
                            </b-input-group>

                            <b-input-group class="mb-3">
                              <b-input-group-prepend>
                                <b-input-group-text><i class="icon-globe"></i></b-input-group-text>
                              </b-input-group-prepend>
                              <b-form-input type="text" class="form-control" placeholder="Website" autocomplete="site" />
                            </b-input-group>


                            <b-button variant="success" block>Verein registrieren</b-button>
                          </b-form>


                        </b-card-body>

                      </b-card>
          </b-tab>
          <b-tab title="Admin" >
            <br>I'm the second tab content
          </b-tab>
        </b-tabs>


   </div>
</template>

<script>
export default {
  name: 'ClubRegister',
  data () {
      return {
        clubname: null,
        file: null,
        url: null,
      }
    },
    methods: {
        onSubmit (evt) {
          evt.preventDefault();
          alert(JSON.stringify(this.form));
        },
        onFileChange(e) {
          const file = e.target.files[0];
          this.url = URL.createObjectURL(file);
        }

    }
}
</script>
