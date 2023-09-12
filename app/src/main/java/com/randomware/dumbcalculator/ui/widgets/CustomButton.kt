package com.randomware.dumbcalculator.ui.widgets

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomButton(onClick: () -> Unit, text: String) {
    Button(
        onClick = onClick,
        modifier = Modifier,
        content = {
            Text(text = text)
        }
    )
}

@Preview
@Composable
fun CustomButtonPreview() {
    CustomButton(onClick = {}, text = "0")
}
