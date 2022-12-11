package com.xworkz.exception.rule;

import java.awt.AWTError;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.RasterFormatException;
import java.awt.print.PrinterAbortException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.io.NotActiveException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URISyntaxException;
import java.net.UnknownServiceException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.time.zone.ZoneRulesException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TooManyListenersException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

import javax.lang.model.type.MirroredTypeException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMRuntimeException;
import javax.naming.AuthenticationException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.w3c.dom.DOMException;
import org.w3c.dom.ls.LSException;

import com.sun.javafx.css.CssError;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;
import com.sun.xml.internal.ws.spi.db.DatabindingException;

import sun.dc.pr.PRError;

public class Event {
	public void event1() {
		
		
		
		System.out.println("event 1");
		throw new RuntimeException();
	}

	public void event2() {
		System.out.println("event 2");
		throw new WrongMethodTypeException();
	}

	public void event3() {
		System.out.println("event 3");
		throw new UnsupportedOperationException();
	}

	public void event4() {
		System.out.println("event 4");
		throw new UnmodifiableSetException();
	}

	public void event5() {
		System.out.println("event 4");
		throw new UndeclaredThrowableException(null);
	}

	public void event6() {
		System.out.println("event 6");
		throw new TypeNotPresentException(null, null);
	}

	public void event7() {
		System.out.println("event 7");
		throw new SecurityException();
	}

	public void event8() {
		System.out.println("event 8");
		throw new RejectedExecutionException();
	}

	public void event9() {
		System.out.println("event 9");
		throw new RasterFormatException(null);
	}

	public void event10() {
		System.out.println("event 10");
		throw new ProviderNotFoundException();
	}

	public void event11() {
		System.out.println("event 11");
		throw new NullPointerException();
	}

	public void event12() {
		System.out.println("event 12");
		throw new NoSuchMechanismException();
	}
	public void event13() {
		System.out.println("event 13");
		throw new NoSuchElementException();
	}
	public void event14() {
		System.out.println("event 14");
		throw new NegativeArraySizeException();
	}
	public void event15() {
		System.out.println("event 15");
		throw new MissingResourceException(null, null, null);
	}
	public void event16() {
		System.out.println("event 16");
		throw new MirroredTypeException(null);
	}
	public void event17() {
		System.out.println("event 17");
		throw new MalformedParameterizedTypeException();
	}
	public void event18() {
		System.out.println("event 18");
		throw new LSException((short) 0, null);
	}
	public void event19() {
		System.out.println("event 19");
		throw new JMRuntimeException();
	}
	public void event20() {
		System.out.println("event 20");
		throw new IndexOutOfBoundsException();
	}
	public void event21() {
		System.out.println("event 21");
		throw new IncompleteAnnotationException(null, null);
	}
	public void event22() {
		System.out.println("event 22");
		throw new IllegalStateException();
	}
	public void event23() {
		System.out.println("event 23");
		throw new IllegalPathStateException();
	}
	public void event24() {
		System.out.println("event 24");
		throw new IllegalArgumentException();
	}
	public void event25() {
		System.out.println("event 25");
		throw new FileSystemNotFoundException();
	}
	public void event26() {
		System.out.println("event 26");
		throw new EnumConstantNotPresentException(null, null);
	}
	public void event27() {
		System.out.println("event 27");
		throw new EmptyStackException();
	}
	public void event28() {
		System.out.println("event 28");
		throw new DOMException((short) 0, null);
	}
	public void event29() {
		System.out.println("event 29");
		throw new DatabindingException();
	}
	public void event30() {
		System.out.println("event 30");
		throw new ConcurrentModificationException();
	}
	public void event31() {
		System.out.println("event 31");
		throw new CMMException(null);
	}
	public void event32() {
		System.out.println("event 32");
		throw new CannotRedoException();
	}
	public void event33() {
		System.out.println("event 33");
		throw new BufferUnderflowException();
	}
	public void event34() {
		System.out.println("event 34");
		throw new BufferOverflowException();
	}
	public void event35() {
		System.out.println("event 35");
		throw new ArrayStoreException();
	}
	
	
	public void event36() {
		System.out.println("event 36");
		throw new Error();
	}

	public void event37() {
		System.out.println("event 37");
		throw new AbstractMethodError();
	}

	public void event38() {
		System.out.println("event 38");
		throw new AssertionError();
	}

	public void event39() {
		System.out.println("event 39");
		throw new AWTError(null);
	}

	public void event40() {
		System.out.println("event 40");
		throw new CoderMalfunctionError(null);
	}

	public void event41() {
		System.out.println("event 41");
		throw new FactoryConfigurationError();
	}

	public void event42() {
		System.out.println("event 42");
		throw new IOError(null);
	}

	public void event43() {
		System.out.println("event 43");
		throw new LinkageError();
	}

	public void event44() {
		System.out.println("event 44");
		throw new ThreadDeath();
	}

	public void event45() {
		System.out.println("event 45");
		throw new TransformerFactoryConfigurationError();
	}

	public void event46() {
		System.out.println("event 46");
		throw new AbstractMethodError();
	}
	public void event47() {
		System.out.println("event 47");
		throw new BootstrapMethodError();
	}
	public void event48() {
		System.out.println("event 48");
		throw new ClassCircularityError();
	}
	public void event49() {
		System.out.println("event 49");
		throw new ClassFormatError();
	}
	public void event50() {
		System.out.println("event 50");
		throw new ExceptionInInitializerError();
	}
	public void event51() {
		System.out.println("event 51");
		throw new IncompatibleClassChangeError();
	}
	public void event52() {
		System.out.println("event 52");
		throw new NoClassDefFoundError();
	}
	public void event53() {
		System.out.println("event 53");
		throw new UnsatisfiedLinkError();
	}
	public void event54() {
		System.out.println("event 54");
		throw new VerifyError();
	}
	public void event55() {
		System.out.println("event 55");
		throw new GenericSignatureFormatError();
	}
	public void event56() {
		System.out.println("event 56");
		throw new InstantiationError();
	}
	public void event57() {
		System.out.println("event 57");
		throw new InternalError();
	}
	public void event58() {
		System.out.println("event 58");
		throw new ServiceConfigurationError("Str");
	}
	public void event59() {
		System.out.println("event 59");
		throw new ServiceConfigurationError("nusha");
	}
	public void event60() {
		System.out.println("event 60");
		throw new UnknownError();
	}
	public void method61() throws Exception {
		System.out.println("running method61");
		throw new Exception();
	}
	public void method62() throws MidiUnavailableException {
		System.out.println("running method62");
		throw new MidiUnavailableException();
	}
	public void method63() throws AuthenticationException {
		System.out.println("running method63");
		throw new AuthenticationException();
	}

	public void method64() throws AlreadyBoundException {
		System.out.println("running method64");
		throw new AlreadyBoundException();
	}

	public void method65() throws InvalidApplicationException {
		System.out.println("running method65");
		throw new InvalidApplicationException(getClass());
	}

	public void method66() throws BadBinaryOpValueExpException {
		System.out.println("running method66");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method67() throws BadLocationException {
		System.out.println("running method67");
		throw new BadLocationException(null, 0);
	}

	public void method68() throws BadStringOperationException {
		System.out.println("running method68");
		throw new BadStringOperationException(null);
	}

	public void method69() throws BadBinaryOpValueExpException {
		System.out.println("running method69");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method70() throws BadLocationException {
		System.out.println("running method70");
		throw new BadLocationException(null, 0);
	}

	public void method71() throws DestroyFailedException {
		System.out.println("running method71");
		throw new DestroyFailedException();
	}

	public void method72() throws GeneralSecurityException {
		System.out.println("running method72");
		throw new GeneralSecurityException();
	}

	public void method73() throws DestroyFailedException {
		System.out.println("running method73");
		throw new DestroyFailedException();
	}

	public void method74() throws ExecutionException {
		System.out.println("running method74");
		throw new ExecutionException(null);
	}

	public void method75() throws FontFormatException {
		System.out.println("running method75");
		throw new FontFormatException(null);
	}

	public void method76() throws InvalidMidiDataException {
		System.out.println("running method76");
		throw new InvalidMidiDataException();
	}

	public void method77() throws ZoneRulesException {
		System.out.println("running method77");
		throw new ZoneRulesException(null, null);
	}
	

	public void method78() throws GeneralSecurityException {
		System.out.println("running method78");
		throw new GeneralSecurityException();
	}

	public void method79() throws GSSException {
		System.out.println("running method79");
		throw new GSSException(0);
	}

	
	public void method80() throws IllegalClassFormatException {
		System.out.println("running method80");
		throw new IllegalClassFormatException();
	}

	public void method81() throws UnknownServiceException {
		System.out.println("running method81");
		throw new UnknownServiceException();
	}

	public void method82() throws UserPrincipalNotFoundException {
		System.out.println("running method82");
		throw new UserPrincipalNotFoundException(null);
	}

	public void method83() throws URISyntaxException {
		System.out.println("running method83");
		throw new URISyntaxException(null, null);
	}

	public void method84() throws URIReferenceException {
		System.out.println("running method84");
		throw new URIReferenceException();
	}

	public void method85() throws PrivilegedActionException {
		System.out.println("running method85");
		throw new PrivilegedActionException(null);
	}

	public void method86() throws PropertyVetoException {
		System.out.println("running method86");
		throw new PropertyVetoException(null, null);
	}

	public void method87() throws MarshalException {
		System.out.println("running method87");
		throw new MarshalException(null);
	}

	public void method88() throws NotActiveException, NotBoundException {
		method89();
		System.out.println("running method88");
		throw new NotActiveException();
	}

	public void method89() throws NotBoundException {
		System.out.println("running method89");
		throw new NotBoundException();
	}

	public void method90() throws LineUnavailableException {
		System.out.println("running method90");
		throw new LineUnavailableException();
	}

	public void method91() throws ParseException {
		System.out.println("running method 91");
		throw new ParseException(null, 0);
	}

	public void method92() throws ParserConfigurationException {
		System.out.println("running method 92");
		throw new ParserConfigurationException(null);
	}

	public void method93() throws PrinterAbortException {
		System.out.println("running method 93");
		throw new PrinterAbortException();
	}

	public void method94() throws TransformerConfigurationException {
		
		System.out.println("running method 94");
		throw new TransformerConfigurationException();
	}

	
	
	
	
	public void method95() throws TooManyListenersException {
		System.out.println("running method 95");
		throw new TooManyListenersException();
	}
	public void event96() {
		System.out.println("event 96");
		throw new VerifyError();
	}
	public void event97() {
		try { event98();
		}catch(StackOverflowError e) {
		
		System.out.println("event 97");}
		
		throw new UnsatisfiedLinkError();
	}
	public void event98() {
		System.out.println("event 98");
		throw new StackOverflowError();
	}
	public void event99() {
		
		try {event96();
		method95();
		method94();
	
		}
		catch(VerifyError|TooManyListenersException|TransformerConfigurationException e) {
			
		System.out.println("event 99");}
		throw new NoSuchFieldError();
	}
	public void event100() {
		System.out.println("event 100");
		throw new PRError();
	
}

}


















































