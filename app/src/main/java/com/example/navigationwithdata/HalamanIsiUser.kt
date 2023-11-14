package com.example.navigationwithdata

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.navigationwithdata.data.OrderUIState

@Composable
fun HalamanIsiUser(
    orderUIState: OrderUIState,
    onClickBackButton: () -> Unit
){
    Column(
        modifier = Modifier
            .padding(17.dp)
            .fillMaxSize()
    ){
        Text(text = "Nama")
        Text(text = orderUIState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Alamat")
        Text(text = orderUIState.alamat)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Telepon")
        Text(text = orderUIState.telepon)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClickBackButton){
            Text(text = stringResource(id = R.string.btn_back))
        }
    }
}