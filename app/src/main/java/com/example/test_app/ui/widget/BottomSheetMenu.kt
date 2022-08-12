package com.example.test_app.ui.widget

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test_app.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetMenu : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.bottom_sheet_menu, container, false)

    companion object {
        const val TAG = "ModalBottomSheet"
    }
}