import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransactionreciptComponent } from './transactionrecipt.component';

describe('TransactionreciptComponent', () => {
  let component: TransactionreciptComponent;
  let fixture: ComponentFixture<TransactionreciptComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TransactionreciptComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TransactionreciptComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
