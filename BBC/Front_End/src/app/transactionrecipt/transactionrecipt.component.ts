import { Component, OnInit } from '@angular/core';
import { HttpserviceService } from '../httpservice.service';
import { Router,ActivatedRoute } from '@angular/router';
import { billinfo } from '../model/billinfo';

@Component({
  selector: 'app-transactionrecipt',
  templateUrl: './transactionrecipt.component.html',
  styleUrls: ['./transactionrecipt.component.css']
})
export class TransactionreciptComponent implements OnInit {
  transaction: billinfo[] =[];
  billid!:number ;
 
  constructor(private service:HttpserviceService,
    private router:Router,
    private route: ActivatedRoute) { }

  ngOnInit(): void {
    
    
  }
  


  getBillDetails(){
  this.service.transactiondetails(this.billid).subscribe(
    (data:any) => {
      this.transaction = data;
      
    }
    
  );
 }

}
