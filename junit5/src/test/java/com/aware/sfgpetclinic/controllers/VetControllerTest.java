package com.aware.sfgpetclinic.controllers;

import com.aware.sfgpetclinic.fauxspring.Model;
import com.aware.sfgpetclinic.fauxspring.ModelImpl;
import com.aware.sfgpetclinic.services.SpecialtyService;
import com.aware.sfgpetclinic.services.VetService;
import com.aware.sfgpetclinic.services.map.SpecialityMapService;
import com.aware.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class VetControllerTest {

    VetService vetService;
    SpecialtyService specialtyService;
    VetController vetController;

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);
        vetController = new VetController(vetService);
    }

    @Test
    void listVets() {
        Model model = new ModelImpl();
        String view = vetController.listVets(model);
        assertThat("vets/index").isEqualTo(view);
    }
}