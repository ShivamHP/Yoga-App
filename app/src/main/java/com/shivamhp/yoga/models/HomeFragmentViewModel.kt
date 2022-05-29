package com.shivamhp.yoga.models

import androidx.lifecycle.ViewModel

class HomeFragmentViewModel: ViewModel() {
    private var _currentAsana: Int = -1;
    fun getCurrentAsana() : Int{
        return _currentAsana
    }
    fun setCurrentAsana(pos: Int){
        _currentAsana = pos
    }
}