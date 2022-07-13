<template>
	<div>
		<p v-if="error">Something went wrong...</p>
		<p v-else-if="loading">Loading...</p>
		<p v-else v-for="author in result.authors" :key="author.id">
			{{ author.firstName }} {{ author.lastName }} - {{ author.email }}
		</p>
	</div>
</template>

<script>
import gql from 'graphql-tag'
import { useQuery } from '@vue/apollo-composable'

const QUERY = gql`
	query Authors {
		authors {
			id
			firstName
			lastName
			email
		}
	}
`

export default {
	name: 'HelloWorld',
	setup() {
		const { result, loading, error } = useQuery(QUERY)
		return {
			result,
			loading,
			error,
		}
	},
}
</script>

<style></style>
