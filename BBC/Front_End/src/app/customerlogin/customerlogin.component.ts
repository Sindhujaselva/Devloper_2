import { Component, OnDestroy, OnInit } from '@angular/core';
// import { HttpService } from '../http.service';
import { HttpserviceService } from '../httpservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-customerlogin',
  templateUrl: './customerlogin.component.html',
  styleUrls: ['./customerlogin.component.css']
})
export class CustomerloginComponent implements OnInit,OnDestroy {

  isShow:boolean=true;

  ID_PATTERN ="'[0-9]{6}'"

  incorrect:string='';
  constructor(private service:HttpserviceService,
              private router:Router) { }

  ngOnInit(): void {
    document.body.className='bg_background';
  }
  onShow(){
    this.isShow=!this.isShow;
  }

  onSubmit(f:NgForm){

    let obj={
      id:f.value.id,
      otp:f.value.otp
    }


    this.service.login(obj)
    .subscribe((response:any)=>{
      console.log(response);
      console.log(typeof response.status)

     
      // this.router.navigate(['/home']);
      if(response.status===true){
        console.log(response);
        // navigate to dashboard
        //sessionStorage.setItem("username",response.username);
        this.router.navigate(['/home']);
      }else{
        this.incorrect=response;
      }

      
    })

  }

  ngOnDestroy(): void {
    document.body.className='';
  }

}
function onLoginSuccess() {
  throw new Error('Function not implemented.');
}

