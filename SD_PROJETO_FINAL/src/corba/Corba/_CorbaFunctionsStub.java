package corba.Corba;


/**
* Corba/_CorbaFunctionsStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Corba.idl
* Quarta-feira, 19 de Junho de 2013 21h56min39s BRT
*/

public class _CorbaFunctionsStub extends org.omg.CORBA.portable.ObjectImpl implements CorbaFunctions
{

  public boolean addRestaurante (short id, String nome, short capacidade)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addRestaurante", true);
                $out.write_short (id);
                $out.write_string (nome);
                $out.write_short (capacidade);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return addRestaurante (id, nome, capacidade        );
            } finally {
                _releaseReply ($in);
            }
  } // addRestaurante

  public boolean addCinema (short id, String nome, short idFilme, String nomeFilme, short horario, short capacidade)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addCinema", true);
                $out.write_short (id);
                $out.write_string (nome);
                $out.write_short (idFilme);
                $out.write_string (nomeFilme);
                $out.write_short (horario);
                $out.write_short (capacidade);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return addCinema (id, nome, idFilme, nomeFilme, horario, capacidade        );
            } finally {
                _releaseReply ($in);
            }
  } // addCinema

  public boolean addTeatro (short id, String nome, short idPeca, String nomePeca, short horario, short capacidade)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addTeatro", true);
                $out.write_short (id);
                $out.write_string (nome);
                $out.write_short (idPeca);
                $out.write_string (nomePeca);
                $out.write_short (horario);
                $out.write_short (capacidade);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return addTeatro (id, nome, idPeca, nomePeca, horario, capacidade        );
            } finally {
                _releaseReply ($in);
            }
  } // addTeatro

  public String recuperaRestaurante (short id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("recuperaRestaurante", true);
                $out.write_short (id);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return recuperaRestaurante (id        );
            } finally {
                _releaseReply ($in);
            }
  } // recuperaRestaurante

  public String recuperaCinema (short idCinema, short idFilme, short idHorario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("recuperaCinema", true);
                $out.write_short (idCinema);
                $out.write_short (idFilme);
                $out.write_short (idHorario);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return recuperaCinema (idCinema, idFilme, idHorario        );
            } finally {
                _releaseReply ($in);
            }
  } // recuperaCinema

  public String recuperaTeatro (short idTeatro, short idPeca, short idHorario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("recuperaTeatro", true);
                $out.write_short (idTeatro);
                $out.write_short (idPeca);
                $out.write_short (idHorario);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return recuperaTeatro (idTeatro, idPeca, idHorario        );
            } finally {
                _releaseReply ($in);
            }
  } // recuperaTeatro

  public boolean retiraCapacidadeRestaurante (short id, short capacidade)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("retiraCapacidadeRestaurante", true);
                $out.write_short (id);
                $out.write_short (capacidade);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return retiraCapacidadeRestaurante (id, capacidade        );
            } finally {
                _releaseReply ($in);
            }
  } // retiraCapacidadeRestaurante

  public boolean retiraCapacidadeCinema (short idCinema, short idFilme, short idHorario, short capacidade)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("retiraCapacidadeCinema", true);
                $out.write_short (idCinema);
                $out.write_short (idFilme);
                $out.write_short (idHorario);
                $out.write_short (capacidade);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return retiraCapacidadeCinema (idCinema, idFilme, idHorario, capacidade        );
            } finally {
                _releaseReply ($in);
            }
  } // retiraCapacidadeCinema

  public boolean retiraCapacidadeTeatro (short idTeatro, short idPeca, short idHorario, short capacidade)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("retiraCapacidadeTeatro", true);
                $out.write_short (idTeatro);
                $out.write_short (idPeca);
                $out.write_short (idHorario);
                $out.write_short (capacidade);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return retiraCapacidadeTeatro (idTeatro, idPeca, idHorario, capacidade        );
            } finally {
                _releaseReply ($in);
            }
  } // retiraCapacidadeTeatro

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Corba/CorbaFunctions:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _CorbaFunctionsStub
