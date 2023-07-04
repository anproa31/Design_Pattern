package org.example.abstract_factory;

import java.util.Optional;
import java.util.Scanner;

public class Demo {
    private static Optional<GetVoucher> configureVoucher()  {
        GetVoucher voucher;
        VoucherAbstractFactory factory;
        Scanner input = new Scanner(System.in);
        String voucherType = input.nextLine();
        if (voucherType.equals("Evening")) {
            factory = new EveningVoucherFactory();
        } else if (voucherType.equals("Morning")) {
            factory = new MorningVoucherFactory();
        }else {
            factory = null;
        }
        try {
            assert factory != null;
            voucher = new GetVoucher(factory);
            return Optional.of(voucher);
        } catch (Exception e) {
            return Optional.empty();
        }

    }

    public static void main(String[] args) {
        Optional<GetVoucher> voucher = configureVoucher();
        if(voucher.isPresent()) {
            voucher.get().ShowVoucher();
        } else {
            System.out.println("Invalid voucher type");
        }
    }
}
