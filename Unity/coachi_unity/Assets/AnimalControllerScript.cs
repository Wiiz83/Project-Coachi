using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;
public class AnimalControllerScript : MonoBehaviour {
	[SerializeField] Animator anim;
	private Rigidbody rb;
	// navigation
	NavMeshAgent agent;
	// positions
	Vector3 center_point;
	Vector3 bed1_point;
	Vector3 bed2_point;
	Vector3 destination;

	float speed = 0.5f;

	// Use this for initialization
	void Start () {
		rb = GetComponent<Rigidbody> ();
		agent = GetComponent<NavMeshAgent> ();
		center_point = GameObject.Find ("center_point").transform.position;
		bed1_point = GameObject.Find ("bed1_point").transform.position;
		bed2_point = GameObject.Find ("bed2_point").transform.position;
		moveTo (center_point);
	}

	void moveTo (Vector3 destination) {
		walk ();
		this.destination = destination;
		agent.destination = destination;
	}

	// Update is called once per frame
	void Update () {
		if (Vector3.Distance (transform.position, agent.destination) <= 1f) {
			stop ();
		}

	}

	// Animation State

	public void stop () {
		SetSpeed (0);
		SetIdleState (0);
	}

	public void walk () {
		SetSpeed (speed);
	}

	public void SetSpeed (float speed) {
		anim.SetFloat ("Speed", Math.Abs (speed));
	}

	public void SetIdleState (int state) {
		anim.SetFloat ("Idle State", state);
	}

}