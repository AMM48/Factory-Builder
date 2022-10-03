
package com.mycompany.factorybuilder;

public class Archer implements Characters{
    private String name;
    private Avatar avatar;
    
    public Archer(String name){
        if (name == null ) {
            throw new IllegalArgumentException("Character must have a name");
        }
        this.name=name;
        this.avatar=new Avatar.Builder(SkinTone.FAIR)
        .withHairColor(HairColor.WHITE)
        .withHairType(HairType.SHORT)
        .withBodyType(BodyType.SKINNY)
        .withFacialFeatures(FacialFeatures.LIGHT_BEARD)
        .build();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    @Override
    public Avatar getAvatar() {
        // TODO Auto-generated method stub
        return this.avatar;
    }

    @Override
    public void setAvatar(Avatar avatar) {
        // TODO Auto-generated method stub
        this.avatar = avatar;
    }

    public String toString(){
        return this.name+" has "+this.avatar.toString();
    }
    
}
