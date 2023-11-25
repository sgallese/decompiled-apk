package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import io.realm.o0;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class EquipmentListDeserializer implements k<List<Equipment>> {
    @Override // com.google.gson.k
    public List<Equipment> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        Equipment equipment;
        x0 x0Var = new x0();
        if (lVar.o()) {
            n i10 = lVar.i();
            o0 Z0 = o0.Z0();
            List<Equipment> z02 = Z0.z0(Z0.k1(Equipment.class).p());
            Z0.close();
            for (Equipment equipment2 : z02) {
                if (i10.D(equipment2.getKey())) {
                    l x10 = i10.x(equipment2.getKey());
                    if (x10.o()) {
                        Equipment equipment3 = (Equipment) jVar.a(x10.i(), Equipment.class);
                        equipment2.setText(equipment3.getText());
                        equipment2.setValue(equipment3.getValue());
                        equipment2.setType(equipment3.getType());
                        equipment2.setKlass(equipment3.getKlass());
                        equipment2.setSpecialClass(equipment3.getSpecialClass());
                        equipment2.setIndex(equipment3.getIndex());
                        equipment2.setNotes(equipment3.getNotes());
                        equipment2.setCon(equipment3.getCon());
                        equipment2.setStr(equipment3.getStr());
                        equipment2.setPer(equipment3.getPer());
                        equipment2.set_int(equipment3.get_int());
                        equipment2.setTwoHanded(equipment3.getTwoHanded());
                        equipment2.setMystery(equipment3.getMystery());
                        equipment2.setGearSet(equipment3.getGearSet());
                    } else {
                        equipment2.setOwned(Boolean.valueOf(x10.a()));
                    }
                    x0Var.add(equipment2);
                    i10.F(equipment2.getKey());
                }
            }
            for (Map.Entry<String, l> entry : lVar.i().w()) {
                if (entry.getValue().o()) {
                    equipment = (Equipment) jVar.a(entry.getValue(), Equipment.class);
                } else {
                    Equipment equipment4 = new Equipment();
                    equipment4.setKey(entry.getKey());
                    if (entry.getValue().n()) {
                        equipment4.setOwned(Boolean.FALSE);
                    } else {
                        equipment4.setOwned(Boolean.valueOf(entry.getValue().a()));
                    }
                    equipment = equipment4;
                }
                x0Var.add(equipment);
            }
        } else {
            Iterator<l> it = lVar.h().iterator();
            while (it.hasNext()) {
                x0Var.add((Equipment) jVar.a(it.next().i(), Equipment.class));
            }
        }
        return x0Var;
    }
}
