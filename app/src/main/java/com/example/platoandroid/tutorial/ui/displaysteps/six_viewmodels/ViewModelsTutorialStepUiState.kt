package com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.platoandroid.data.model.TutorialStepUiState
import com.example.platoandroid.data.model.TutorialSubStep
import com.example.platoandroid.tutorial.ui.TutorialStepCard
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepEight
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepEighteen
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepFifteen
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepFive
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepFour
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepNine
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepNineteen
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepOne
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepSeven
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepSeventeen
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepSix
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepSixteen
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepTen
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepThirteen
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepThree
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepTwelve
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepTwenty
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepTwentyOne
import com.example.platoandroid.tutorial.ui.displaysteps.six_viewmodels.substeps.ViewModelSupStepTwo

class ViewModelsTutorialStepUiState : TutorialStepUiState {
  @Composable
  override fun displayBlock(onHelpRequest: (request: @Composable () -> Unit) -> Unit, showNextStep: () -> Unit) {
    TutorialStepCard(title = "ViewModels") {
      Text(text = "ViewModels are special classes we use to hold all of the data needed to determine what a particular screen should currently be displaying.")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "If you break the word apart you will see its made of 2 words: View and Model")
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = "This is because it is a model of the data for a given view.")
      Spacer(modifier = Modifier.height(8.dp))
      Button(onClick = { showNextStep() }) {
        Text(text = "Why would we need a ViewModel?")
      }
    }
  }

  override fun getSubSteps(): List<TutorialSubStep> = listOf(
    ViewModelSupStepOne(),
    ViewModelSupStepTwo(),
    ViewModelSupStepThree(),
    ViewModelSupStepFour(),
    ViewModelSupStepFive(),
    ViewModelSupStepSix(),
    ViewModelSupStepSeven(),
    ViewModelSupStepEight(),
    ViewModelSupStepNine(),
    ViewModelSupStepTen(),
    ViewModelSupStepTwelve(),
    ViewModelSupStepThirteen(),
    ViewModelSupStepFifteen(),
    ViewModelSupStepSixteen(),
    ViewModelSupStepSeventeen(),
    ViewModelSupStepEighteen(),
    ViewModelSupStepNineteen(),
    ViewModelSupStepTwenty(),
    ViewModelSupStepTwentyOne(),
  )
}