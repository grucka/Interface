package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser ,HIPAACompliantAdmin{

    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;

    // TO DO: Implement a constructor that takes an ID and a role

    public AdminUser(Integer id,String role) {
        super(id);
        this.role=role;
        this.securityIncidents = new ArrayList<>();
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reportSecurityIncidents'");
    }

    @Override
    public boolean assignPin(int pin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignPin'");
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accessAuthorized'");
    }
}
