package com.ninidze.pokerapp.di

import com.ninidze.pokerapp.PokerViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::PokerViewModel)
}