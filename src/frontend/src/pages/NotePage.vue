<template>
	<div class="page">
		<p v-if="error">Something went wrong...</p>
		<p v-else-if="loading">Loading...</p>
		<div v-else class="note__list">
			<p v-for="note in result.notes" :key="note.id">
				<NoteComponent class="note__component" :note="note" />
			</p>
		</div>
	</div>
</template>

<script>
import gql from 'graphql-tag'
import { useQuery } from '@vue/apollo-composable'
import NoteComponent from '../components/note/NoteComponent'

const QUERY = gql`
	query Notes {
		notes {
			id
			content
			author {
				firstName
				lastName
			}
		}
	}
`
export default {
	name: 'NotePage',
	components: {
		NoteComponent,
	},
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

<style>
.page {
	display: flex;
	justify-content: center;
	align-items: center;
}

.note__list {
	display: flex;
	flex-direction: column;
	width: 80%;
	margin: auto;
}
</style>
