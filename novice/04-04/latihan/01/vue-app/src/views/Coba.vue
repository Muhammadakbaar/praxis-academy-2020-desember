<template>
    <div class="coba">
        <VTreeview 
          :node="root"
          @onClick="nodeWasClicked"
        />
    </div>
</template>

<script>
import Coba from '@/components/Coba.vue'
import VTreeview from '@/components/VTreeview.vue'

export default {
    name: 'coba',
    data() {
      return {
        root: {
          name: 'github.com/',
          children: [
            {
              name: 'akbarlaz/',
              children: [
                {
                  name: 'hey-there-delillah-post-modern-jukebox.mp3'
                },
                {
                  name: 'senorita-via-vallen.mp3'
                }
              ]
            },
            {
              name: 'praxis-academy/',
              children: [
                {
                  name: 'akademik/',
                  children: [
                    {
                      name: 'kurikulum/',
                      children: [
                        {
                          name: 'readme'
                        }
                      ]
                    },
                    {
                      name: 'panduan-umum/',
                      children: [
                        {
                          name: 'readme'
                        }
                      ]
                    }
                  ]
                },
                {
                  name: 'batches/',
                  children: [
                    {
                      name: 'fsead',
                    },
                    {
                      name: 'README.md'
                    },
                    {
                      name: 'WeekendFE.md'
                    }
                  ]
                },
                {
                  name: 'presentation/',
                  children: [
                    {
                      name: 'LICENSE'
                    },
                    {
                      name: 'README.md'
                    },
                    {
                      name: 'microservices.odp'
                    },
                    {
                      name: 'microservices.pdf'
                    }
                  ]
                }
              ]
            }
          ]
        }
      }
    },
    methods: {
      nodeWasClicked() {
        window.open("https://github.com/praxis-academy/akademik/blob/master/kurikulum/README.md", "_blank", "toolbar=yes,top=500,left=500,width=400,height=400");
      }
    },
    components: {
        Coba,
        VTreeview
    }
}
</script>

