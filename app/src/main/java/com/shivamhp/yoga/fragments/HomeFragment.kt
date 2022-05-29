package com.shivamhp.yoga.fragments

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.shivamhp.yoga.R
import com.shivamhp.yoga.databinding.FragmentHomeBinding
import com.shivamhp.yoga.models.HomeFragmentViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeFragmentViewModel::class.java)
        makeChanges(viewModel.getCurrentAsana())
        binding.savasanaImgHomeFragment.setOnClickListener {
            viewModel.setCurrentAsana(1)
            makeChanges(viewModel.getCurrentAsana())
        }
        binding.chakrasanaImgHomeFragment.setOnClickListener {
            viewModel.setCurrentAsana(2)
            makeChanges(viewModel.getCurrentAsana())
        }
        binding.parvatasanaImgHomeFragment.setOnClickListener {
            viewModel.setCurrentAsana(3)
            makeChanges(viewModel.getCurrentAsana())
        }
        binding.dhanurasanaImgHomeFragment.setOnClickListener {
            viewModel.setCurrentAsana(4)
            makeChanges(viewModel.getCurrentAsana())
        }
    }

    @SuppressLint("SetTextI18n")
    fun makeChanges(pos: Int){
        if(pos == -1){
            binding.poseImgHomeFragment.setImageResource(R.drawable.welcome_pic)
            binding.titleTxtHomeFragment.setText("Welcome!")
            binding.descriptionTextHomeFragment.setText("This is a yoga app which would help you get information on some asanas"
            + "\n"
            + "Please press any one of the above asanas to get more information about it.")
            binding.savasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.chakrasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.parvatasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.dhanurasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
        } else if(pos == 1){
            binding.titleTxtHomeFragment.setText("Shavasana")
            binding.descriptionTextHomeFragment.setText("Shavasana (Sanskrit: शवासन; IAST: śavāsana), Corpse Pose, or Mrtasana,[1] is an asana in hatha yoga and modern yoga as exercise, often used for relaxation at the end of a session. It is the usual pose for the practice of yoga nidra meditation. \nThe name comes from the Sanskrit words शव Śava, \"corpse\" and आसन Āsana, \"posture\" or \"seat\".[2] The alternative name Mrtasana is from Sanskrit मृत mṛta, \"death\".[1]\n" +
                    "\n" +
                    "The earliest mention of this asana is in the 15th century Hatha Yoga Pradipika 1.32, which states in the context of a medieval belief system that \"lying down on the ground supine, like a corpse, is called Shavasana. It eliminates tiredness and promotes calmness of the mind.\"[3][4] +" +
                    "\n" +
                    "Shavasana is performed on the back with the legs spread as wide as the yoga mat and arms relaxed to the side, and the eyes closed. The whole body is relaxed on the floor with an awareness of the chest and abdomen rising and falling with each breath. During Shavasana, all parts of the body are scanned for muscular tension of any kind. Any muscular tension the body finds is consciously released as it is found. All control of the breath, the mind, and the body is then released for the duration of the asana. Shavasana is typically practiced for 5–10 minutes at the end of an asana practice, but can be practiced for 20–30 minutes.[1]")
            binding.poseImgHomeFragment.setImageResource(R.drawable.savasana)
            binding.savasanaTxtHomeFragment.setTextColor(Color.parseColor("#FFFFFF"))
            binding.chakrasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.parvatasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.dhanurasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
        } else if(pos == 2){
            binding.titleTxtHomeFragment.setText("Chakrasana")
            binding.descriptionTextHomeFragment.setText(
                "Chakrasana (Sanskrit: चक्रासन, romanized: Cakrāsana, lit. 'Wheel Pose') or Urdhva Dhanurasana (Sanskrit: ऊर्ध्वधनुरासन, romanized: Ūrdhvadhanurāsana, lit. 'Upward-Facing Bow Pose') is an asana in yoga as exercise. It is a backbend and is the first pose of the finishing sequence in Ashtanga Vinyasa Yoga. It gives great flexibility to the spine. In acrobatics and gymnastics this body position is called a bridge. "
                + "\n" +
                "The name Chakrasana comes from the Sanskrit words चक्र chakra, \"wheel\", and आसन āsana, \"posture\" or \"seat\". The name Urdhva Dhanurasana comes from the Sanskrit urdhva ऊर्ध्व, upwards, and dhanura धनु, a bow (for shooting arrows).[1][2][3]\n" +
                "\n" +
                "The pose is illustrated in the 19th century Sritattvanidhi as Paryaṇkāsana, Couch Pose.[4] "
                + "\n" +
                "In the general form of the asana, the practitioner has hands and feet on the floor, and the abdomen arches up toward the sky. It may be entered from a supine position or through a less rigorous supine backbend, such as Setu Bandha Sarvangasana (Bridge Pose). Some advanced practitioners can move into Wheel Pose by \"dropping back\" from Tadasana (Mountain Pose), or by standing with the back to a wall, reaching arms overhead and walking hands down the wall toward the floor. Advanced practitioners may also follow wheel with any of its variations (listed below), or with other backbends, such as Dwi Pada Viparita Dandasana, or by pushing back up to stand in Tadasana [5][6]"
            )
            binding.poseImgHomeFragment.setImageResource(R.drawable.chakrasana)
            binding.savasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.chakrasanaTxtHomeFragment.setTextColor(Color.parseColor("#FFFFFF"))
            binding.parvatasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.dhanurasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
        } else if(pos==3){
            binding.titleTxtHomeFragment.setText("Parvatasana")
            binding.descriptionTextHomeFragment.setText(
                "Note: Do not search \"Parvatasana\" on WikiPedia"
                + "\n" +
                "Parvatasana or the Mountain pose is part of the Sun Salutation series of asanas. It appears as the 4th pose and the 9th pose in the Sun Salutation or Surya Namaskara. In Sanskrit “Parvata’ means mountain. The pose looks like a mountain from the sides and hence the name Parvatasana."
                + "\n" +
                "The Sanskrit word Parvatasana is derived from Parvat, which means mountains and asana that means pose. Practiced for thousands of years, this Mountain Pose is one of the simplest and most effective of all yoga asanas. In yoga Parvatasana is a seated pose in which the legs are in the padmasana pose and the upper body is stretched upwards. The body in its entirety assumes the shape of a mountain. According to yogic science, the Mountain Pose stimulates and balances the heart chakra that's located at the centre of the spine. This chakra is said to regulate emotions like forgiveness, empathy, love, compassion, etc. While Imbalances in this chakra lead to several psychological and physical issues, these can be cured by regularly practicing yoga and especially asanas like Parvatasana."
            )
            binding.poseImgHomeFragment.setImageResource(R.drawable.parvatasana)
            binding.savasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.chakrasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.parvatasanaTxtHomeFragment.setTextColor(Color.parseColor("#FFFFFF"))
            binding.dhanurasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
        } else if(pos == 4){
            binding.titleTxtHomeFragment.setText("Dhanurasana")
            binding.descriptionTextHomeFragment.setText(
                "Dhanurasana (Sanskrit: धनुरासन, romanized: Dhanurāsana, lit. 'Bow pose') is a back bending asana in hatha yoga and modern yoga as exercise. "
                + "\n" +
                "The name comes from the Sanskrit words धनुर (dhanur) meaning \"bow\",[2][3] and आसन (āsana) meaning \"posture\" or \"seat\".[4]\n" +
                        "\n" +
                        "A similar pose named Nyubjasana, \"the face-down asana\", is described and illustrated in the 19th century Sritattvanidhi.[5] The pose is illustrated in half-tone in the 1905 Yogasopana Purvacatuska and named Dhanurāsana, quoting the Gheranda Samhita's description.[6]\n" +
                        "\n" +
                        "It is unclear whether the asana is medieval, as although the name is used, the intended pose might be the sitting Akarna Dhanurasana rather than this backbend. The account of Dhanurasana in the 15th century Hatha Yoga Pradipika is ambiguous about whether the pose is reclining or sitting, stating[1]\n" +
                        "\n" +
                        "    Having held the big toes of both feet with both hands, one should pull [them] like a bow as far as the ears. This is called bow pose. (HYP 1.25)\n" +
                        "\n" +
                        "The 17th century Gheranda Samhita is similarly ambiguous, stating\n" +
                        "\n" +
                        "    Spreading the legs on the ground, straight like a stick, and catching hold of the feet with the hands, and making the body bent like a bow, is called by the Yogis the Dhanurasana or Bow-posture. (GhS 2.18)[7]\n" +
                        "\n" +
                        "Dhanurasana is used in the classical Indian dance form Bharatanatyam.[8] "
            )
            binding.poseImgHomeFragment.setImageResource(R.drawable.dhanurasana)
            binding.savasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.chakrasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.parvatasanaTxtHomeFragment.setTextColor(Color.parseColor("#999999"))
            binding.dhanurasanaTxtHomeFragment.setTextColor(Color.parseColor("#FFFFFF"))
        }
    }
}