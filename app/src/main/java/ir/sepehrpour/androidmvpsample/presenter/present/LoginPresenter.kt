package ir.sepehrpour.androidmvpsample.presenter.present

import ir.sepehrpour.androidmvpsample.model.Login
import ir.sepehrpour.androidmvpsample.presenter.contract.ILogin

class LoginPresenter(var view: ILogin.View) : ILogin.Presenter {


    override fun login(userName: String, password: String) {
        val loginModel = Login()

        if (userName==loginModel.userName && password==loginModel.password){
            view.onSuccess("Login is OK (from presenter)")
        }else{
            view.onFail("Login is Fail (from presenter)")
        }
    }
}