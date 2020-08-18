package com.learn.coding.systemdesign.restraunts.InfrastructureEntities;

import java.util.List;

public class Restaurant {
        private String name;
        private List<Branch> branches;
        public boolean addBranch(Branch branch) {
            return true;
    }
}
