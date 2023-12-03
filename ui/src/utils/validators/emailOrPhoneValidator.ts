import { AbstractControl, ValidationErrors, ValidatorFn } from "@angular/forms";

export function emailOrPhoneValidator(regex: RegExp): ValidatorFn {
    return (control: AbstractControl): ValidationErrors | null => {
      const forbidden = regex.test(control.value);
      return !forbidden ? { emailOrPhone: { value: control.value } } : null;
    };
  }