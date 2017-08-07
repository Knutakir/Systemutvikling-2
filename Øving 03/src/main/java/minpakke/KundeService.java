package minpakke;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/kunder")
public class KundeService { 
    private static Map<String,Kunde> kunder = new HashMap<String,Kunde>(){{
        put("1", new Kunde("1", "Nils"));
        put("222", new Kunde("222", "testingobjekt"));
    }};

    @GET 
    @Path("/{kundeId}") 
    @Produces(MediaType.APPLICATION_JSON) 
    public Kunde getKunde(@PathParam("kundeId") String kundeId) {
        if (kunder.get(kundeId) != null) {
            return kunder.get(kundeId);
        } else {
            throw new javax.ws.rs.NotFoundException("Fant ikke noen kunde med gitt id");
        }
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON) 
    public Collection<Kunde> getKunder() {
        return kunder.values(); 
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addKunde(Kunde kunde) {
        if (kunder.get(kunde.getId()) != null) {
            throw new javax.ws.rs.ForbiddenException("Det eksisterer allerede en bruker med denne id'en");
        } else {
            kunder.put(kunde.getId(), kunde);
        }
    }

    @DELETE
    @Path("/{kundeId}")
    public void deleteKunde(@PathParam("kundeId") String kundeId) {
        if (kunder.get(kundeId) != null) {
            kunder.remove(kundeId);
        } else {
            throw new javax.ws.rs.ForbiddenException("Det er ingen bruker å slette med denne id'en");
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void changeKunde(Kunde kunde) {
        //for (int i = 0; i < kunder.size(); i++) {
          //  if (kunder.get(i).getId() == kunde.getId()) {
        if (kunder.get(kunde.getId()) != null) {
            kunder.get(kunde.getId()).setNavn(kunde.getNavn());
        } else {
            throw new javax.ws.rs.NotFoundException("Fant ingen kunde med gitt id");
        }
                //return Response.ok().build();
            //}
        //}
        //throw javax.ws.rs.NotFoundException;
        //return Response.status(Response.Status.NOT_FOUND).entity("Fant ikke brukeren med id: " + kunde.getId()).build();
    }
}