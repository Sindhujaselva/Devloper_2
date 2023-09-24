import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { HomeComponent } from './home/home.component';
import { PaymentComponent } from './payment/payment.component';
import { TransactionreciptComponent } from './transactionrecipt/transactionrecipt.component';

const routes: Routes = [
  {path:'',redirectTo:'/customerlogin',pathMatch:'full'},
  {path:'customerlogin',component:CustomerloginComponent},
  { path: 'home', component: HomeComponent },
  { path: 'payment', component: PaymentComponent },
  {
    path:'transactionrecipt',component:TransactionreciptComponent
  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
