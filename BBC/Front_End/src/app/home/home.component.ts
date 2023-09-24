import { Component, OnInit } from '@angular/core';
import { HttpserviceService } from '../httpservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  nameSearch: string = '';
  bills:any[]=[]
  
  // bills: any[] = [{
  //   billId: 1,
  //     amount: 100.0,
  //     unitsConsumed: 50,
  //     dueDate: new Date('2023-09-30'),
  //     status:'paid'},
  //     {

  //     billId: 2,
  //     amount: 420.0,
  //     unitsConsumed: 55,
  //     dueDate: new Date('2023-09-30'),
  //     status:'unpaid'
      

  // }];
  
  isSelect:boolean=false;
  selectedBill: any;
    // modalRef!: BsModalRef; 
    
  constructor(private service:HttpserviceService, private router:Router) { }

  ngOnInit(): void {
    // this.listbill();
    this.displaybilldetails();
  }
  onEdit(){
    // console.log(item);
    this.isSelect=true;
    
    
  }

  // listbill(){
  //   this.service.displaybilldetails().subscribe(
  //     (data) => this.bills
  //   )
  // }
  navigateToPayment(status: string) {
    if (status === 'unpaid') {
      this.router.navigate(['/payment']);
    }
  }
  displaybilldetails(){
    this.service.displaybilldetails()
    .subscribe((response:any)=>
    {
      console.log(response);
      this.bills = response;
    }
    
    
    )
  }

}
