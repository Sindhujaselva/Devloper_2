import { Component, OnInit } from '@angular/core';
import { HttpserviceService } from '../httpservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  constructor(private service:HttpserviceService,
    private router:Router) {}

  ngOnInit(): void {
    this.ChangeBillStatus();
  }

  payment = {
    selectedPaymentMethod: '',
    accountNumber: '',
    cvv: '',
    paymentAmount: ''
  };
  paymentMethods: string[] = ['Credit Card', 'Debit Card', 'Wallet'];
  paymentMethodError: string = '';
  paymentAmountError: string = '';
  otp = '';
  


  confirmOtp: string = '';
  paymentData:string = '';

  submitPaymentForm() {
    // Reset error messages
    this.paymentMethodError = '';
    this.paymentAmountError = '';

    if (!this.payment.selectedPaymentMethod) {
      this.paymentMethodError = 'Please select a payment method.';
      return; // Exit the function
    }

    const amount = parseFloat(this.payment.paymentAmount);
    if (isNaN(amount) || amount <= 0 || amount > 10000) {
      this.paymentAmountError = 'Payment amount must be between 1 and 10,000.';
      return; // Exit the function
    }

    if (this.otp === this.confirmOtp) {
      // OTPs match, show a success message
      alert('Payment successful!');
      this.ChangeBillStatus();
      this.router.navigate(['/transactionrecipt']);
    } else {
      // OTPs do not match, show an error message
      alert('OTP mismatch. Please enter the correct OTP.');
    }
  }

  generateOTP() {
    this.otp = Math.floor(1000 + Math.random() * 9000).toString();
  }
  // savepayment(){

  
//   this.service.savePayment().subscribe(
//     (response:any) => {
//       // Handle the successful response from the backend
//       console.log('Payment saved:', response);
//       alert('Payment successful!');
//     },
//     (error:any) => {
//       // Handle any errors that occur during the API call
//       console.error('Error saving payment:', error);
//       alert('Error saving payment. Please try again later.');
//      }
  
// )


bill:string=' ';

ChangeBillStatus(){
  this.service.changeBillStatus()
  .subscribe((response:any)=>
  {
     console.log(response);
     this.bill=response;

  })
 }
}

