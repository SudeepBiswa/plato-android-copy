package com.example.platoandroid.data.model

import androidx.compose.runtime.Composable

interface TutorialStepUiState {
  @Composable
  fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit)

  fun getSubSteps() : List<TutorialSubStep>
}