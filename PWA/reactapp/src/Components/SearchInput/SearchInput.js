import React from 'react'
import styles from './Search.module.css'

const SearchInput = (props) => {
    const keyChange = (e) => {
        const searchKey = e.target.value
        props.onSearchChange &&
            props.onSearchChange(searchKey)
    }
    return (
        <input
            className={styles['input']}
            placeholder="Search"
            type="search"
            onChange={keyChange}
        />
    )
}
export default SearchInput