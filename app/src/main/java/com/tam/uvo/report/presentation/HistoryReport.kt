package com.tam.uvo.report.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tam.uvo.report.presentation.component.Header
import com.tam.uvo.report.presentation.component.ReportSend

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HistoryReport(){
    val scrollState = rememberScrollState()
    Column(modifier = Modifier
        .verticalScroll(scrollState)
        .fillMaxSize()
    ) {
        Header()
        Spacer(modifier = Modifier.height(10.dp) )
        ReportSend()
    }
}
