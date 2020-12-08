<template>
    <div>
        <div 
            @click="nodeClicked"
            :style="{'margin-left': `${depth * 20}px` }"
            class="node"
            >
            <span
                v-if="hasChildren" 
                class="type">{{expanded ? '&#9660;' : '&#9658;'}}
            </span>
            <span
                class="type"
                v-else
            >&#9671;</span>
            <span class="type">{{node.name}}</span>
        </div>
        <div v-if="expanded">
            <VTreeview
               
            v-for="child in node.children"
            :key="child.name"
            :node="child"
            :depth="depth + 1"
            @onClick="(node) => $emit('onClick', node)"
        />
        </div>
        
    </div>
</template>

<script>
export default {
    name: 'VTreeview',
    props: {
        msg: String,
        node: Object,
        depth: {
            type: Number,
            default: 0,
        }
    },
    data() {
        return {
            expanded: false,
        }
    },
    methods: {
        nodeClicked() {
            this.expanded = !this.expanded;
            if (!this.hasChildren) {
                this.$emit('onClick', this.node);
            }
        }
    },
    computed: {
        hasChildren() {
            return this.node.children;
        }
    }
}
</script>

<style scoped>
    .node {
        text-align: left;
    }
    .type {
        cursor: pointer; 
    }
</style>