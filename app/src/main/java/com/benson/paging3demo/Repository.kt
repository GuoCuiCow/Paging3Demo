package com.benson.paging3demo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.PagingSource
import kotlinx.coroutines.flow.Flow

object Repository {
    private const val PAGE_SIZE = 50
    private val api = ApiService.createApi()
    fun getData(): Flow<PagingData<Repo>> {
        return Pager(
            config = PagingConfig(PAGE_SIZE),
            pagingSourceFactory = { RepoPagingSource(api) }
        ).flow
    }
}
