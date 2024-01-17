package home.ui

sealed class HomeEvent {
    data object  RefreshNote : HomeEvent()
}