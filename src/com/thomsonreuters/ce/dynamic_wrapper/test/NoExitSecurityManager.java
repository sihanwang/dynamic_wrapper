package com.thomsonreuters.ce.dynamic_wrapper.test;

import java.security.Permission;

public class NoExitSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) 
    {
        // allow anything.
    }
    @Override
    public void checkPermission(Permission perm, Object context) 
    {
        // allow anything.
    }
    @Override
    public void checkExit(int status) 
    {
        super.checkExit(status);
        throw new ExitException(status);
    }
}
