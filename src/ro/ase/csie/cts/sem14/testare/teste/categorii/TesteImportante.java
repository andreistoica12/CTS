package ro.ase.csie.cts.sem14.testare.teste.categorii;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.sem13.testare.test.TestStudent;
import ro.ase.csie.cts.sem13.testare.test.TestStudentAlteTeste;

@RunWith(Categories.class)
@IncludeCategory({TesteImportante.class})
@SuiteClasses({ TestStudent.class, TestStudentAlteTeste.class })
public class TesteImportante {

}
