package com.sun.corba.se.spi.activation.LocatorPackage;


/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocation.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u202/12319/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, December 15, 2018 12:40:35 PM PST
*/

public final class ServerLocation implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public com.sun.corba.se.spi.activation.ORBPortInfo ports[] = null;

  public ServerLocation ()
  {
  } // ctor

  public ServerLocation (String _hostname, com.sun.corba.se.spi.activation.ORBPortInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocation
