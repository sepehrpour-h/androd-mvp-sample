package ir.sepehrpour.androidmvpsample.presenter.contract

interface ILogin {
    interface View {
        fun onSuccess(message: String)
        fun onFail(message: String)
    }

    interface Presenter {
        fun login(userName: String, password: String)
    }
}