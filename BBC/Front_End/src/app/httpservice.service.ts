import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HttpserviceService {
  customerlogin(obj: { id: any; otp: any; }) {
    throw new Error('Method not implemented.');
  }
  
  url:String = environment.baseurl;
  url2:string ="http://localhost:8080/bill/";
  url3:string ="http://localhost:8080/";
  url4:string = "http://localhost:8080/"

  // login(obj: { id: any; otp: any; }) {
  //   throw new Error('Method not implemented.');
  // }

  constructor(private http:HttpClient) { }

  login(obj:any){
    console.log(this.url)
    return (this.http.post(`${this.url}`,obj,{responseType:"json"}));
  }
  displaybilldetails(){
    return (this.http.get(`${this.url2}1`))
  }
  // savePayment() {
  //   return this.http.post(`${this.url3}save`,null,null,);
  // }
  changeBillStatus(){
    return (this.http.put(`${this.url4}updateBillStatus?billid=2`,null))
  }
  transactiondetails(billid:number){
    return (this.http.get(`${this.url4}transactiondetail/${billid}`))
  }



}
