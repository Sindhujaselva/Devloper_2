import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { PaymentComponent } from './payment/payment.component';
import { TransactionreciptComponent } from './transactionrecipt/transactionrecipt.component';

@NgModule({
  declarations: [
    AppComponent,
    
    CustomerloginComponent,
         HomeComponent,
         HeaderComponent,
         PaymentComponent,
         TransactionreciptComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
