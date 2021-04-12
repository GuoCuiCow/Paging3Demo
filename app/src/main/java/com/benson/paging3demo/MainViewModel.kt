package com.benson.paging3demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import kotlinx.coroutines.flow.Flow

class MainViewModel() : ViewModel() {

    fun getPagingData(): Flow<PagingData<Repo>> {
        // 缓存数据进viewModelScope，当手机横竖屏切换时就不需要重新去网络请求了
        return Repository.getData().cachedIn(viewModelScope)
    }
}
