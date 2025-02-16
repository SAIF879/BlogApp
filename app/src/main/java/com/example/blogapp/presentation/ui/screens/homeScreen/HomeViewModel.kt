package com.example.blogapp.presentation.ui.screens.homeScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blogapp.data.model.BlogData
import com.example.blogapp.data.util.ApiResult
import com.example.blogapp.domain.usecases.GetBlogUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(private val getBlogUseCase: GetBlogUseCase) : ViewModel()
{

    init {
        fetchBlogs()
    }

    private val _blogList = MutableStateFlow<ApiResult<List<BlogData>>>(ApiResult.Loading)
    val blogList: StateFlow<ApiResult<List<BlogData>>> = _blogList

    private fun fetchBlogs() {
        viewModelScope.launch(Dispatchers.IO) {
            getBlogUseCase().collect { result ->
                _blogList.value = result
            }
        }
    }

}
